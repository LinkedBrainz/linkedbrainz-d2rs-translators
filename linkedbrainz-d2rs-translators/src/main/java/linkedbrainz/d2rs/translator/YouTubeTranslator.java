package linkedbrainz.d2rs.translator;

import linkedbrainz.d2rs.translator.util.BaseUriCleanUpTranslator;

/**
 * 
 * @author zazi
 * 
 */
public class YouTubeTranslator extends BaseUriCleanUpTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://youtube.com/";

	public YouTubeTranslator()
	{
		super(ORIGINAL_BASE_URI);
	}
}
