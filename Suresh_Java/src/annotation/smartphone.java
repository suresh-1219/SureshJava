package annotation;
//empty marker annotation
//single value annotation
public @interface smartphone {
	String os()default"windows";
	int version()default 10;

}
