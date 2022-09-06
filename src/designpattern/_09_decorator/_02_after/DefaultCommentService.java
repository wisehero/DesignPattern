package src.designpattern._09_decorator._02_after;

public class DefaultCommentService implements CommentService {
	@Override
	public void addComment(String comment) {
		System.out.println(comment);
	}
}
