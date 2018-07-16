package com.accenture.Youtube.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.youtube.com")
public class Youtubepage extends PageObject {

    @FindBy(name="search_query")
    private WebElementFacade buscar;

    @FindBy(id="search-icon-legacy")
    private WebElementFacade Button;

    @FindBy(css="#contents > ytd-video-renderer:nth-child(1)") 
    private WebElementFacade video;
    
    @FindBy(xpath="//ytd-button-renderer[@class='style-scope ytd-menu-renderer force-icon-button style-default size-default']//a[@class='yt-simple-endpoint style-scope ytd-button-renderer']") 
    private WebElementFacade compartir;
    
    @FindBy(css="#contents > ytd-share-target-renderer:nth-child(4)") 
    private WebElementFacade clickgoogle;
    
    @FindBy(css="#contents > ytd-share-target-renderer:nth-child(4)") 
    private WebElementFacade abrirpestaña;
    
    public void enter_keywords(String keyword) {
        buscar.type(keyword);
    }

    public void lookup_terms() {
       Button.click();
       System.out.println("oprimio boton");
    }
    
    public void Video() {
    	video.click();
    } 
    public void Compartir() {
    	compartir.click();
    } 
    public void Google() {
    	clickgoogle.click();
    }
    }
//    public List<String> getDefinitions() {
//        WebElementFacade definitionList = find(By.tagName("ol"));
//        return definitionList.findElements(By.tagName("li")).stream()
//                             .map( element -> element.getText() )
//                             .collect(Collectors.toList());
//    }
