package linkedbrainz.d2rs.translator;

import de.fuberlin.wiwiss.d2rq.values.Translator;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;

/**
 * 
 * @author kurtjx
 * @author zazi
 * 
 */
public class DurationTranslator implements Translator
{

	public DurationTranslator()
	{

	}

	public String toRDFValue(String dbValue)
	{
		String rdfValue = null;

		try
		{
			rdfValue = Float.toString((new Integer(dbValue)).floatValue());
		} catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rdfValue;
	}

	public String toDBValue(String rdfValue)
	{
		String dbValue = null;

		try
		{
			dbValue = Integer.toString((new Float(rdfValue)).intValue());
		} catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dbValue;
	}
}
