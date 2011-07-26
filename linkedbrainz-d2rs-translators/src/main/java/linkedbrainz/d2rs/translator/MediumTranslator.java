package linkedbrainz.d2rs.translator;

import de.fuberlin.wiwiss.d2rq.values.Translator;

/**
 * @author kurtjx
 * @author zazi
 * 
 * TODO: db-value-to-rdf-value-mapping if necessary
 * 
 */
public class MediumTranslator implements Translator
{
	public static final String BASE_URI = "http://purl.org/ontology/mt/";

	public MediumTranslator()
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
			rdfValue = rdfValue + "CD";
			break;
		case 2:
			rdfValue = rdfValue + "DVD";
			break;
		case 3:
			rdfValue = rdfValue + "SACD";
			break;
		case 4:
			rdfValue = rdfValue + "DualDisc";
			break;
		case 5:
			rdfValue = rdfValue + "LaserDisc";
			break;
		case 6:
			rdfValue = rdfValue + "MiniDisc";
			break;
		case 7:
			rdfValue = rdfValue + "VinylRecord";
			break;
		case 8:
			rdfValue = rdfValue + "Cassette";
			break;
		case 9:
			rdfValue = rdfValue + "Cartridge";
			break;
		case 10:
			rdfValue = rdfValue + "ReelToReel";
			break;
		case 11:
			rdfValue = rdfValue + "DAT";
			break;
		case 12:
			rdfValue = rdfValue + "DigitalMedia";
			break;
		case 13:
			// TODO: value is 'Other'
			rdfValue = rdfValue + "";
			break;
		case 14:
			rdfValue = rdfValue + "WaxCylinder";
			break;
		case 15:
			rdfValue = rdfValue + "PianoRoll";
			break;
		case 16:
			rdfValue = rdfValue + "DCC";
			break;
		case 17:
			rdfValue = rdfValue + "HDDVD";
			break;
		case 18:
			rdfValue = rdfValue + "DVDAudio";
			break;
		case 19:
			rdfValue = rdfValue + "DVDVideo";
			break;
		case 20:
			rdfValue = rdfValue + "BluRayDisc";
			break;
		case 21:
			rdfValue = rdfValue + "VHS";
			break;
		case 22:
			rdfValue = rdfValue + "VCD";
			break;
		case 23:
			rdfValue = rdfValue + "SVCD";
			break;
		case 24:
			rdfValue = rdfValue + "Betamax";
			break;
		case 25:
			rdfValue = rdfValue + "HDCD";
			break;
		case 26:
			rdfValue = rdfValue + "USBFlashDrive";
			break;
		case 27:
			rdfValue = rdfValue + "SlotMusic";
			break;
		case 28:
			rdfValue = rdfValue + "UMD";
			break;
		case 29:
			rdfValue = rdfValue + "VinylRecord";
			break;
		case 30:
			rdfValue = rdfValue + "VinylRecord";
			break;
		case 31:
			rdfValue = rdfValue + "VinylRecord";
			break;
		case 32:
			rdfValue = rdfValue + "Cassette";
			break;
		case 33:
			rdfValue = rdfValue + "CD";
			break;
		case 34:
			rdfValue = rdfValue + "CD";
			break;
		default:
			break;
		}

		return rdfValue;
	}
}
