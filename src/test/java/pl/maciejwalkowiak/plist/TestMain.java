package pl.maciejwalkowiak.plist;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Post post = new Post(new Author("jason bourne"), "java-plist-serializer introduction", 9);
		post.addComment(new Comment("maciejwalkowiak", "first comment"));
		post.addComment(new Comment("john doe", "second comment"));

		PlistSerializer plistSerializer = new PlistSerializerImpl();
		String xml = plistSerializer.toXmlPlist(post);
		System.out.println("xml:" +  xml);
	}

}
