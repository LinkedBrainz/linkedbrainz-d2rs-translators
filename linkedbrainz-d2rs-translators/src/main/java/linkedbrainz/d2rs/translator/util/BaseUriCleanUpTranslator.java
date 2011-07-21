package linkedbrainz.d2rs.translator.util;

import de.fuberlin.wiwiss.d2rq.values.Translator;

/**
 * 
 * @author zazi
 * 
 */
public class BaseUriCleanUpTranslator implements Translator
{

	private String originalBaseUri = null;

	public BaseUriCleanUpTranslator(String originalBaseUri)
	{
		this.originalBaseUri = originalBaseUri;
	}

	public String toDBValue(String rdfValue)
	{
		// should already be formatted
		return rdfValue;
	}

	public String toRDFValue(String dbValue)
	{
		if (Utils.cleanUpBaseURI(dbValue, originalBaseUri) != null)
		{
			// clean up the base URI
			return Utils.cleanUpBaseURI(dbValue, originalBaseUri);
		}
		// URI does not belong to this information service
		else
		{
			return null;
		}
	}
}
