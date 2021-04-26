package com.demotivirus.Day_124;

import com.demotivirus.Day_124.version_1.ChannelNews;
import com.demotivirus.Day_124.version_1.NewsAgency;
import com.demotivirus.Day_124.version_2.ONewsAgency;
import com.demotivirus.Day_124.version_2.ONewsChannel;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        ChannelNews channelNews = new ChannelNews();

        agency.addChannel(channelNews);
        channelNews.setNews("Good morning from Bolivia!");
        System.out.println(channelNews.getNews());

        ONewsAgency oNewsAgency = new ONewsAgency();
        ONewsChannel oNewsChannel = new ONewsChannel();

        oNewsAgency.addObserver(oNewsChannel);
        oNewsChannel.setNews("Tsunami from Pekin");
        System.out.println(oNewsChannel.getNews());
    }
}
