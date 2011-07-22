package linkedbrainz.d2rs.translator;

import linkedbrainz.d2rs.translator.util.BaseUriCleanUpTranslator;

/**
 * 
 * @author zazi
 * 
 */
public class MusicMozTranslator extends BaseUriCleanUpTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://musicmoz.org/";

	public MusicMozTranslator()
	{
		super(ORIGINAL_BASE_URI);
	}
}
