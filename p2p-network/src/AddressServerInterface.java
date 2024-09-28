import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddressServerInterface extends Remote {
	void registerPeer(String alias, String ip, int port) throws RemoteException;
	PeerInfo getPeerInfo(String alias) throws RemoteException;
}
