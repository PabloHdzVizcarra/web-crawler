package jvm.pablo.webcrawler.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface CrawlerService {
    Set<String> findUrls(String url);

    Map<Set<String>, Set<Object>> findRecursive(String url);

    HashMap<String, HashMap<String, ?>> findWithStatistics(String url);
}
