public class Peer implements PeerInterface {
	private String alias;
	private AddressServer addressServer;
	private String ip;
	private int port;
	public Peer(AddressServer addressServer, String alias, String ip, int port){
		this.addressServer = addressServer;
		this.alias = alias;
		this.ip = ip;
		this.port = port;
	}

	public String getAlias() {
		return alias;
	}

	public int getPort() {
		return port;
	}

	public String getIp() {
		return ip;
	}

	public void register(){
		addressServer.registerPeer(this);
	}

	@Override
	public void receiveMessage(Message message){
		System.out.println("Received message from " + message.senderAlias + ": " + message.content);
	}
}
