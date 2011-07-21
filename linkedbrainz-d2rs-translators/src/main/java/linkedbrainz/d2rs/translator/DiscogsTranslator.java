package linkedbrainz.d2rs.translator;

import de.fuberlin.wiwiss.d2rq.values.Translator;

/**
 * 
 * @author zazi
 * 
 */
public class DiscogsTranslator implements Translator
{
	public String toDBValue(String rdfValue)
	{
		String tempRdfValue = rdfValue.replaceFirst(
				"http://discogs.dataincubator.org/", "http://www.discogs.com/");

		return rdfValue;
	}

	public String toRDFValue(String dbValue)
	{
		String tempRdfValue = dbValue.replaceFirst("http://www.discogs.com/",
				"http://discogs.dataincubator.org/");

		// transformation code from ldodds mapping (see
		// http://code.google.com/p/dataincubator/source/browse/trunk/discogs/scripts/lib/Util.rb),
		// which is not reverseable
		// TODO: needs to be converted to Java code
		//
		// example:
		// discogs URL: http://www.discogs.com/artist/Beatles,+The
		// dataincubator URI:
		// http://discogs.dataincubator.org/artist/the-beatles
		//
		/*
		 * #Util code for cleaning up whitespace, newlines, etc def
		 * Util.clean_ws(s) cleaned = s.gsub(/^\r\n/, "") cleaned.gsub!(/\n/,
		 * " ") cleaned.gsub!(/\s{2,}/, " ") cleaned.gsub!(/^\s/, "")
		 */
		tempRdfValue = tempRdfValue.replaceAll("/^\r\n/", "");
		tempRdfValue = tempRdfValue.replaceAll("/\n/", " ");
		
		// requires reformatting
		// tempRdfValue = tempRdfValue.replaceAll("/\s{2,}/", " ");
		// tempRdfValue = tempRdfValue.replaceAll("/^\s/", "");
		
		 /* illegal = /\x00|\x01|\x02|\x03|\x04|\x05|\x06|\x07|\x08|\x0B|
		 * \x0C|\x0E
		 * |\x0F|\x10|\x11|\x12|\x13|\x14|\x15|\x16|\x17|\x18|\x19|\x1A|
		 * \x1B|\x1C|\x1D|\x1E|\x1F/
		 */
		
		// requires reformatting
		// String illegal = "/\x00|\x01|\x02|\x03|\x04|\x05|\x06|\x07|\x08|\x0B|\x0C|\x0E|\x0F|\x10|\x11|\x12|\x13|\x14|\x15|\x16|\x17|\x18|\x19|\x1A|\x1B|\x1C|\x1D|\x1E|\x1F/";
		
		 /* cleaned.gsub!(illegal, " ") if cleaned == "" or cleaned == " " return
		 * nil end return cleaned end
		 */
		
		 /* def Util.slug(s) normalized = s.downcase if
		 * normalized.end_with?(", the") normalized = normalized.gsub(", the",
		 * "") normalized = "the-" + normalized end
		 * 
		 * normalized.gsub!(/\s+/, "-") normalized.gsub!(/\(|\)/, "")
		 * 
		 * normalized.gsub!(/%/, "") normalized.gsub!(/,/, "") normalized.gsub!
		 * /\./, "" normalized.gsub! /&/, "and" normalized.gsub! /\?/, ""
		 * normalized.gsub! /\=/, "" normalized.gsub! /\[/, "" normalized.gsub!
		 * /\{/, "" normalized.gsub! /\]/, "" normalized.gsub! /\}/, ""
		 * normalized.gsub! /"/, "" normalized.gsub! /'/, "" normalized.gsub!
		 * /|/, "" normalized.gsub! /!/, "" normalized.gsub! /:/, ""
		 * 
		 * return normalized end
		 * 
		 * def Util.escape_xml(s) if s == nil return s end
		 * 
		 * escaped = s.dup
		 * 
		 * escaped.gsub!("&", "&amp;") escaped.gsub!("<", "&lt;")
		 * escaped.gsub!(">", "&gt;")
		 * 
		 * return escaped
		 * 
		 * end
		 */

		return dbValue;
	}
}
