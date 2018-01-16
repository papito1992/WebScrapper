package com.mokintis.demo.index;


import com.mokintis.demo.model.DataBank;
import com.mokintis.demo.model.Keyword;
import com.mokintis.demo.model.LinkTable;
import com.mokintis.demo.service.DataBankService;
import com.mokintis.demo.service.IDataBankService;
import com.mokintis.demo.service.KeywordService;
import com.mokintis.demo.service.LinkTableService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.persistence.GeneratedValue;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Job {
    public List<DataBank> run(List<Keyword> keys, List<LinkTable> url) throws IOException, SQLException {
        List<DataBank> datasbank = new ArrayList<>();
        for (LinkTable link :
                url) {
            for (Keyword key : keys) {
                Document document = Jsoup.connect(link.getLinks()).get();
                Elements links = document.getElementsByTag("a");
                for (Element el : links) {
                    List<String> temporary = new ArrayList<>();
                    //    if (el.text().matches("^.*?(unmapped).*$")) {
                    if (el.text().matches("^.*?(" + key.getKeywords() + ").*$")) {

                        DataBank dataBank= new DataBank();
                        dataBank.setInsertedKeyword(key.getKeywords());
                        dataBank.setScrappedLink(link.getLinks());
                        dataBank.setResultingFullTitle(el.text());
                        dataBank.setResultingLink(el.attr("abs:href"));
                        dataBank.setLinktableid(link.getId());
 datasbank.add(dataBank);
  } } } }return datasbank;}}


