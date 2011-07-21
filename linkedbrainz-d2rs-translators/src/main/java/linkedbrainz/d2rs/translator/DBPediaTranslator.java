package linkedbrainz.d2rs.translator;

import linkedbrainz.d2rs.translator.util.BaseUriTranslator;

/**
 * @author kurtjx
 * @author zazi
 * 
 */
public class DBPediaTranslator extends BaseUriTranslator
{
	public static final String ORIGINAL_BASE_URI = "http://wikipedia.org/wiki/";
	public static final String LINKED_DATA_BASE_URI = "http://dbpedia.org/resource/";

	public DBPediaTranslator()
	{
		super(ORIGINAL_BASE_URI, LINKED_DATA_BASE_URI);
	}
}
