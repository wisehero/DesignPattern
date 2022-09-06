package src.designpattern._09_decorator._01_before;

public class Client {

	private CommentService commentService;

	public Client(CommentService commentService) {
		this.commentService = commentService;
	}

	private void writeComment(String comment) {
		commentService.addComment(comment);
	}
}
