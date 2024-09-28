import java.rmi.RemoteException;
import java.util.HashMap;


public class AddressServer implements AddressServerInterface {

	private HashMap<String, Peer> peers;
	public AddressServer() {
		peers = new HashMap<String, Peer>();
	}

	public void registerPeer(Peer peer) {
		peers.put(peer.getAlias(), peer);
	}

	public PeerInfo getPeerInfo(String alias) {
		return new PeerInfo(
			peers.get(alias).getIp(),
			peers.get(alias).getPort()
		);
	}

	@Override
	public void registerPeer(String alias, String ip, int port) throws RemoteException {
		peers.put(alias, new Peer(ip, this));
	}
}
