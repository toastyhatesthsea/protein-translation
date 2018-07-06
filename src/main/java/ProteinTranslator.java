import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    HashMap<String, String> codons;

    List<String> translate(String rnaSequence) {

        List<String> answer = new ArrayList<>();
        String translation = "";

        for(int i=0; i<rnaSequence.length() && !translation.equals("STOP"); i = i+3)
        {
            translation = codons.get(rnaSequence.substring(i, i + 3));

            if (!translation.equals("STOP"))
            {
                answer.add(translation);
            }
        }
        return answer;
    }


    public ProteinTranslator()
    {
        codons = new HashMap<>();

        codons.put("AUG", "Methionine");
        codons.put("UUU", "Phenylalanine");
        codons.put("UUC", "Phenylalanine");
        codons.put("UUA", "Leucine");
        codons.put("UUG", "Leucine");
        codons.put("UCU", "Serine");
        codons.put("UCC", "Serine");
        codons.put("UCA", "Serine");
        codons.put("UCG", "Serine");
        codons.put("UAU", "Tyrosine");
        codons.put("UAC", "Tyrosine");
        codons.put("UGU", "Cysteine");
        codons.put("UGC", "Cysteine");
        codons.put("UGG", "Tryptophan");
        codons.put("UAA", "STOP");
        codons.put("UAG", "STOP");
        codons.put("UGA", "STOP");


    }
}

