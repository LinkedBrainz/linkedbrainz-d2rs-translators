package linkedbrainz.d2rs.translator;

import linkedbrainz.d2rs.translator.util.FragmentIdTranslator;

/**
 * BBC URI translator
 * 
 * @author kurtjx
 * @author zazi
 * 
 */
public class BBCTranslator extends FragmentIdTranslator
{

	public static final String ORIGINAL_FRAGMENT_ID = "";
	public static final String LINKED_DATA_FRAGMENT_ID = "#artist";

	public BBCTranslator()
	{
		super(ORIGINAL_FRAGMENT_ID, LINKED_DATA_FRAGMENT_ID);
	}
}
