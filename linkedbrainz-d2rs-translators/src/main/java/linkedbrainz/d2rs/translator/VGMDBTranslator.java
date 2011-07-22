package linkedbrainz.d2rs.translator;

import linkedbrainz.d2rs.translator.util.BaseUriCleanUpTranslator;

/**
 * 
 * @author zazi
 * 
 */
public class VGMDBTranslator extends BaseUriCleanUpTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://vgmdb.net/";

	public VGMDBTranslator()
	{
		super(ORIGINAL_BASE_URI);
	}
}
