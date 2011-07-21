package linkedbrainz.d2rs.translator.util;

import de.fuberlin.wiwiss.d2rq.values.Translator;
import java.lang.String;

/**
 * 
 * @author zazi
 * 
 */
public class FragmentIdTranslator implements Translator
{
	private String originalFragmentId = null;
	private String linkedDataFragmentId = null;

	public FragmentIdTranslator(String originalFragmentId,
			String linkedDataFragmentId)
	{
		this.originalFragmentId = originalFragmentId;
		this.linkedDataFragmentId = linkedDataFragmentId;
	}

	public String toDBValue(String rdfValue)
	{
		return replaceOrAppend(rdfValue, linkedDataFragmentId,
				originalFragmentId);
	}

	public String toRDFValue(String dbValue)
	{
		return replaceOrAppend(dbValue, originalFragmentId,
				linkedDataFragmentId);
	}

	private String replaceOrAppend(String base, String string1, String string2)
	{
		if (string1.equals(""))
		{
			return base + string2;
		} else
		{
			return base.replace(string1, string2);
		}
	}
}
