package linkedbrainz.d2rs.translator;

import linkedbrainz.d2rs.translator.util.BaseUriCleanUpTranslator;

/**
 * 
 * @author zazi
 * 
 */
public class MySpaceTranslator extends BaseUriCleanUpTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://myspace.com/";

	public MySpaceTranslator()
	{
		super(ORIGINAL_BASE_URI);
	}
}
