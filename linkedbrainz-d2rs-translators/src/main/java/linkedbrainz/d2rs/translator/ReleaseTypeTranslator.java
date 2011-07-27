package linkedbrainz.d2rs.translator;

import de.fuberlin.wiwiss.d2rq.values.Translator;

/**
 * @author zazi
 * 
 *         TODO: db-value-to-rdf-value-mapping if necessary
 * 
 */
public class ReleaseTypeTranslator implements Translator
{
	public static final String BASE_URI = "http://purl.org/ontology/mo/";

	public ReleaseTypeTranslator()
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
			rdfValue = rdfValue + "album";
			break;
		case 2:
			rdfValue = rdfValue + "single";
			break;
		case 3:
			rdfValue = rdfValue + "ep";
			break;
		case 4:
			rdfValue = rdfValue + "compilation";
			break;
		case 5:
			rdfValue = rdfValue + "soundtrack";
			break;
		case 6:
			rdfValue = rdfValue + "spokenword";
			break;
		case 7:
			rdfValue = rdfValue + "interview";
			break;
		case 8:
			rdfValue = rdfValue + "audiobook";
			break;
		case 9:
			rdfValue = rdfValue + "live";
			break;
		case 10:
			rdfValue = rdfValue + "remix";
			break;
		default:
			break;
		}

		return rdfValue;
	}
}
