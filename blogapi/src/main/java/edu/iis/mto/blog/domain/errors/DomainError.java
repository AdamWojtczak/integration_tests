package edu.iis.mto.blog.domain.errors;

public class DomainError extends RuntimeException {

	public static final String USER_REMOVED = "user account has been removed";
	private static final long serialVersionUID = 1L;

    public static final String USER_NOT_FOUND = "unknown user";
    public static final String POST_NOT_FOUND = "unknown post";
    public static final String SELF_LIKE = "cannot like own post";
    public static final String USER_ACCOUNT_NOT_CONFIRMED = "user account has not yet been confirmed";

    public DomainError(String msg) {
        super(msg);
    }

}
