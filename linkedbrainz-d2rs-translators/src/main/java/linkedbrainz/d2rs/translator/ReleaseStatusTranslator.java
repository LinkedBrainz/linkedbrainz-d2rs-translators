package linkedbrainz.d2rs.translator;

import de.fuberlin.wiwiss.d2rq.values.Translator;

/**
 * @author zazi
 * 
 * TODO: db-value-to-rdf-value-mapping if necessary
 * 
 */
public class ReleaseStatusTranslator implements Translator
{
	public static final String BASE_URI = "http://purl.org/ontology/mo/";

	public ReleaseStatusTranslator()
	{

	}

	public String toDBValue(String rdfValue)
	{
		return rdfValue;
	}

	public String toRDFValue(String dbValue)
	{
		String rdfValue = BASE_URI;
		int id = (new Integer(dbValue)).intValue();

		switch (id)
		{
		case 1:
			rdfValue = rdfValue + "official";
			break;
		case 2:
			rdfValue = rdfValue + "promotion";
			break;
		case 3:
			rdfValue = rdfValue + "bootleg";
			break;
		case 4:
			rdfValue = rdfValue + "pseudorelease";
			break;
		default:
			break;
		}

		return rdfValue;
	}
}
