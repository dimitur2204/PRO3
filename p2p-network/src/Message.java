import java.io.Serializable;

public class Message implements Serializable {
	public String senderAlias;
	public String receiverAlias;
	public String content;

	public Message(String senderAlias, String receiverAlias, String content) {
		this.senderAlias = senderAlias;
		this.receiverAlias = receiverAlias;
		this.content = content;
	}
}