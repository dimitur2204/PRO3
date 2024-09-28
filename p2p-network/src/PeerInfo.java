public class PeerInfo implements java.io.Serializable {
	public String ip;
	public int port;
	public PeerInfo(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
}