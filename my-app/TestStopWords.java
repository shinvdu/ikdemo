package com.mycompany.app;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.StringReader;  
  
import javax.imageio.stream.FileImageInputStream;  
  
import org.apache.lucene.analysis.TokenStream;  
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;  
import org.wltea.analyzer.core.IKSegmenter;  
import org.wltea.analyzer.core.Lexeme;  
import org.wltea.analyzer.lucene.IKAnalyzer;  
  
  
  
public class TestStopWords {  
    public static void main(String[] args) throws IOException {  
        String keyWords = "2012年那个欧洲杯四强赛";  
        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("data/stopword.txt")));  
        IKSegmenter ikSegmenter = new IKSegmenter(isr, true);  
        Lexeme lexeme = null;  
        while((lexeme=ikSegmenter.next())!= null){  
            System.out.println(lexeme.getLexemeText());  
        }  
    }  
}     