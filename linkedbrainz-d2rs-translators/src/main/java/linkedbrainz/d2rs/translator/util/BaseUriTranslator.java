package linkedbrainz.d2rs.translator.util;

import de.fuberlin.wiwiss.d2rq.values.Translator;

/**
 * 
 * @author zazi
 * 
 */
public class BaseUriTranslator implements Translator
{
	private String originalBaseUri = null;
	private String linkedDataBaseUri = null;

	public BaseUriTranslator(String originalBaseUri, String linkedDataBaseUri)
	{
		this.originalBaseUri = originalBaseUri;
		this.linkedDataBaseUri = linkedDataBaseUri;
	}

	public String toDBValue(String rdfValue)
	{
		return rdfValue.replaceFirst(linkedDataBaseUri, originalBaseUri);
	}

	public String toRDFValue(String dbValue)
	{
		if (Utils.cleanUpBaseURI(dbValue, originalBaseUri) != null)
		{
			return Utils.cleanUpBaseURI(dbValue, originalBaseUri).replaceFirst(
					originalBaseUri, linkedDataBaseUri);
		}
		// URI does not belong to this information service
		else
		{
			return null;
		}
	}
}
