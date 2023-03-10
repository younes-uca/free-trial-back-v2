package ma.enova.radio.zynerator.security.common;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME = "Authorization";
    public static final String SECRET = "79672f17-0e5c-46a2-97fd-ce46adf2d2f1";
    public static final long EXPIRATION = 86400000;
    public static final String HEADER_PREFIX = "Bearer ";
}
