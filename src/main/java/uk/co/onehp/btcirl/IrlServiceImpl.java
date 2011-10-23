package uk.co.onehp.btcirl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import uk.co.onehp.btcirl.domain.Transaction;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@Service("irlService")
public class IrlServiceImpl implements IrlService {

	private static final BigDecimal LIMIT_1 = new BigDecimal("0.50");
	private static final BigDecimal LIMIT_2 = new BigDecimal("1.00");
	private static final BigDecimal LIMIT_3 = new BigDecimal("2.00");
	private static final BigDecimal LIMIT_4 = new BigDecimal("5.00");
	private static final BigDecimal LIMIT_5 = new BigDecimal("10.00");
	private static final BigDecimal LIMIT_6 = new BigDecimal("20.00");
	private static final BigDecimal LIMIT_7 = new BigDecimal("35.00");
	private static final BigDecimal LIMIT_8 = new BigDecimal("50.00");
	private static final BigDecimal LIMIT_9 = new BigDecimal("75.00");
	private static final BigDecimal LIMIT_10 = new BigDecimal("100.00");
	private static final BigDecimal LIMIT_11 = new BigDecimal("135.00");
	private static final BigDecimal LIMIT_12 = new BigDecimal("170.00");
	private static final BigDecimal LIMIT_13 = new BigDecimal("200.00");
	private static final BigDecimal LIMIT_14 = new BigDecimal("250.00");
	private static final BigDecimal LIMIT_15 = new BigDecimal("350.00");
	private static final BigDecimal LIMIT_16 = new BigDecimal("400.00");
	private static final BigDecimal LIMIT_17 = new BigDecimal("500.00");
	private static final BigDecimal LIMIT_18 = new BigDecimal("650.00");
	private static final BigDecimal LIMIT_19 = new BigDecimal("800.00");
	private static final BigDecimal LIMIT_20 = new BigDecimal("1000.00");
	private static final BigDecimal LIMIT_21 = new BigDecimal("1300.00");
	private static final BigDecimal LIMIT_22 = new BigDecimal("1600.00");
	private static final BigDecimal LIMIT_23 = new BigDecimal("2000.00");
	private static final BigDecimal LIMIT_24 = new BigDecimal("2500.00");
	private static final BigDecimal LIMIT_25 = new BigDecimal("3000.00");
	private static final BigDecimal LIMIT_26 = new BigDecimal("3600.00");
	private static final BigDecimal LIMIT_27 = new BigDecimal("4200.00");
	private static final BigDecimal LIMIT_28 = new BigDecimal("5000.00");
	private static final BigDecimal LIMIT_29 = new BigDecimal("6000.00");
	private static final BigDecimal LIMIT_30 = new BigDecimal("7000.00");
	private static final BigDecimal LIMIT_31 = new BigDecimal("8500.00");
	private static final BigDecimal LIMIT_32 = new BigDecimal("10000.00");
	private static final BigDecimal LIMIT_33 = new BigDecimal("12000.00");
	private static final BigDecimal LIMIT_34 = new BigDecimal("14000.00");
	private static final BigDecimal LIMIT_35 = new BigDecimal("17000.00");
	private static final BigDecimal LIMIT_36 = new BigDecimal("20000.00");
	private static final BigDecimal LIMIT_37 = new BigDecimal("25000.00");
	private static final BigDecimal LIMIT_38 = new BigDecimal("30000.00");
	private static final BigDecimal LIMIT_39 = new BigDecimal("40000.00");
	private static final BigDecimal LIMIT_40 = new BigDecimal("50000.00");
	private static final BigDecimal LIMIT_41 = new BigDecimal("70000.00");
	private static final BigDecimal LIMIT_42 = new BigDecimal("100000.00");
	private static final BigDecimal LIMIT_43 = new BigDecimal("150000.00");
	private static final BigDecimal LIMIT_44 = new BigDecimal("200000.00");
	private static final BigDecimal LIMIT_45 = new BigDecimal("300000.00");
	private static final BigDecimal LIMIT_46 = new BigDecimal("400000.00");
	private static final BigDecimal LIMIT_47 = new BigDecimal("500000.00");
	private static final BigDecimal LIMIT_48 = new BigDecimal("750000.00");
	private static final BigDecimal LIMIT_49 = new BigDecimal("1000000.00");
	private static final BigDecimal LIMIT_50 = new BigDecimal("2000000.00");
	private static final BigDecimal LIMIT_END = new BigDecimal("2000000.01");

	private static final List<BigDecimal> LIMITS = Lists.newArrayList(LIMIT_1,LIMIT_2,LIMIT_3,LIMIT_4,LIMIT_5,LIMIT_6,LIMIT_7,LIMIT_8,LIMIT_9,LIMIT_10,LIMIT_11,LIMIT_12,LIMIT_13,LIMIT_14,LIMIT_15,LIMIT_16,LIMIT_17,LIMIT_18,LIMIT_19,LIMIT_20,LIMIT_21,LIMIT_22,LIMIT_23,LIMIT_24,LIMIT_25,LIMIT_26,LIMIT_27,LIMIT_28,LIMIT_29,LIMIT_30,LIMIT_31,LIMIT_32,LIMIT_33,LIMIT_34,LIMIT_35,LIMIT_36,LIMIT_37,LIMIT_38,LIMIT_39,LIMIT_40,LIMIT_41,LIMIT_42,LIMIT_43,LIMIT_44,LIMIT_45,LIMIT_46,LIMIT_47,LIMIT_48,LIMIT_49,LIMIT_50);

	public static Map<BigDecimal, List<String>> irls;
	static {
		irls = Maps.newHashMap();
		irls.put(LIMIT_1, Lists.newArrayList("a hair scrunchi","a bag of chips","a bag of chips","some chewing gum","a candy bar"));
		irls.put(LIMIT_2, Lists.newArrayList("an Amazon Kindle e-Book","a children's sticker activity book","a whiteboard marker refill cartridge","a contact lens case","a pack of 10 pens"));
		irls.put(LIMIT_3, Lists.newArrayList("a 4.5 inch cupid cooking mold","a pack of DVD proteective sleeves","a 3ft HDMI cable","a bathroom hand brush","a pack of cat toys"));
		irls.put(LIMIT_4, Lists.newArrayList("a baseball","a humane mouse trap","a pair of earings","a mouse mat","an 8 oz hipflask"));
		irls.put(LIMIT_5, Lists.newArrayList("a basketball","a baseball glove","an ink cartridge","a pack of 15 rewritable DVDs","a CD from a popular artist"));
		irls.put(LIMIT_6, Lists.newArrayList("a pair of Skullcandy in-ear headphones","an American football","a youth baseball bat","an Addidas soccer ball","a Parker straight razor"));
		irls.put(LIMIT_7, Lists.newArrayList("a pack of 10 Gillette MACH3 razor blades","a pizza oven","a pets exercise pen","a jewellery display stand","a slow cooker"));
		irls.put(LIMIT_8, Lists.newArrayList("a pair of Sennheiser in-ear headphones","an Oral-B power toothbrush","a Phillips electric shaver","a Black and Decker waffle maker","an Xbox 360 video game"));
		irls.put(LIMIT_9, Lists.newArrayList("a Motorola RAZR phone","a pair of Sony monitor headphones","a pair of Sennheiser sports headphones","a Logitech wireless solar keyboard","a Dremel rotary tool kit"));
		irls.put(LIMIT_10, Lists.newArrayList("a Kodak 12 MP waterproof digital camera","a pair of Sony wireless headphones","a Lifetime Youth basketball hoop","a Bosch electric sander kit","a G-Shock military style watch"));
		irls.put(LIMIT_11, Lists.newArrayList("a BlackBerry Storm smartphone","an LG Blu-ray player","a pair of Nike Air Max","a Tommy Hilfiger mens sports watch","a TomTom 4.3 inch GPS navigator"));
		irls.put(LIMIT_12, Lists.newArrayList("a pair of Beats by Dre in-ear headphones","a Samsung Blu-ray player","a Kinect sensor for the Xbox 360","a Seiko mens chronograph watch","a Fox Racing motocross helmet"));
		irls.put(LIMIT_13, Lists.newArrayList("a Sony 10.2 MP digital camera","a BlackBerry Curve smartphone","an Amazon Kindle 3G e-reader","an Xbox 360 4GB","a Nintendo Wii"));
		irls.put(LIMIT_14, Lists.newArrayList("a Canon 12.1 MP digital camera","a HTC Nexus One smartphone","a Samsung 22 inch 1080p LED TV","a pair of Nike Air Jordans","a pair of HUGO BOSS mens patent leather shoes"));
		irls.put(LIMIT_15, Lists.newArrayList("a HTC HD7 smartphone","an Acer 32 inch 1080p LCD TV","a Panasonic 32 inch 702p LCD TV","a pair of Beats by Dre noise cancelling headphones","a Dyson Ball vacuum cleaner"));
		irls.put(LIMIT_16, Lists.newArrayList("a Canon 14.1 MP 35x zoom digital camera","a Sony 16.2 MP panoramic digital camera","a BlackBerry Bold smartphone","an Amazon Kindle DX 3G e-reader","a Bose MP3 player speaker dock"));
		irls.put(LIMIT_17, Lists.newArrayList("a Motorola Droid smartphone","a Samsung Nexus S smartphone","a Phillips speaker dock for iPhone/iPod","a Motorola XOOM tablet wifi version","a Samsung Galaxy tablet 10.1 inch 16GB wifi version"));
		irls.put(LIMIT_18, Lists.newArrayList("a Canon 10.1 MP digital SLR camera","a Panasonic 12 MP micro four-thirds digital camera","a HTC Sensation smartphone","a Sony 40 inch 1080p LCD TV","a Sony 15.5 inch laptop"));
		irls.put(LIMIT_19, Lists.newArrayList("an Apple iPhone 4 smartphone","a Samsung Galaxy S II smartphone","a Samsung 46 inch 1080p LCD TV","a Motorola XOOM tablet","a Dell 17.3 inch laptop"));
		irls.put(LIMIT_20, Lists.newArrayList("a VIZIO 47 inch 3D LED TV","an Apple Macbook Air 11.6 inch laptop","a Sony 16.4 inch widescreen laptop","a Samsung fridge freezer","a Whirlpool electric oven"));
		irls.put(LIMIT_21, Lists.newArrayList("a Sharp Aquos 52 inch LED TV","a Sharp Aquos 60 inch widescreen TV","a laptop computer","a computer","a new bed"));
		irls.put(LIMIT_22, Lists.newArrayList("a Sony Bravia 52 inch TV","a camera","a wedding ring","an Apple iMac 27-Inch Desktop","a purebred dog"));
		irls.put(LIMIT_23, Lists.newArrayList("a Whirlpool Duet electric laundry washer and dryer","a decent laptop","a brand new Refridgerator","a 2010 Kawasaki 110cc motorcycle","an Apple Macbook Pro"));
		irls.put(LIMIT_24, Lists.newArrayList("a 2002 Honda Civic","an LCD TV","a cheape car","an ambulance ride","a 3D TV"));
		irls.put(LIMIT_25, Lists.newArrayList("a Sony 7.1 surround sound system","a digital projector","a Rolex watch","a fancy wristwatch","a 3D TV"));
		irls.put(LIMIT_26, Lists.newArrayList("an billiard table","a used car","a Samsung LCD Flat Screen TV","a month's rent for an apartment in a fancy part of Manhattan","a used car"));
		irls.put(LIMIT_27, Lists.newArrayList("a 2005 Honda Civic","a huge TV","a stairlift","a wedding dress","a used car"));
		irls.put(LIMIT_28, Lists.newArrayList("a 2005 Toyota Echo","a used car","a vacation","a very fancy computer","a projector to watch TV with"));
		irls.put(LIMIT_29, Lists.newArrayList("a 2005 Toyota Echo","a basic swimming pool","a Panasonic 60 inch plasma TV","tedtalk tickets","an old used car"));
		irls.put(LIMIT_30, Lists.newArrayList("a Knoll Barcelona Couch","a Gucci Handbag","some kitchen cabinets","a 64 inch Sony plasma TV","a used Volkswagon Passat"));
		irls.put(LIMIT_31, Lists.newArrayList("a 1997 GMC 8500 single axle cab","a motorcycle","a used Prius","an air compressor","a 1997 BMW car"));
		irls.put(LIMIT_32, Lists.newArrayList("a Rolex Champagne Diamond Dial mens watch","a 2011 Nissan Versa Sedan","a used 2009 Honda Civic","a Motorcycle","a Hyundai Accent sedan"));
		irls.put(LIMIT_33, Lists.newArrayList("an LG 47 inch 3D TV","a small boat","a painting done by someone moderately famous","a really  cheap old car","a Harley Davidson motorcycle"));
		irls.put(LIMIT_34, Lists.newArrayList("a new Hyundai Accent","a vacation","a used 2010 Chevrolet Cobalt LT","a 2010 Ford Car","a hot tub"));
		irls.put(LIMIT_35, Lists.newArrayList("a Hyundai Elantra","http","a 2011 Ford Pathfinder","a Fairlight synthesizer","a used car"));
		irls.put(LIMIT_36, Lists.newArrayList("a new Honda Civic 2010","an outdoor movie theatre","a 2012 VW Beetle","a 2010 Toyota Corrola","a Saturn Vue"));
		irls.put(LIMIT_37, Lists.newArrayList("a used boat","A Sanyo 48 inch lcd TV","a mid-sized sedan car","a Toyota Prius","a Nissan Leaf electric car"));
		irls.put(LIMIT_38, Lists.newArrayList("a 2011 Toyota Avalon", "some emerald sterling silver earrings","a huge home theatre package","a 2.04-Carat Blue Nile signature asscher cut diamond","a fancy car","a sports car"));
		irls.put(LIMIT_39, Lists.newArrayList("a luxury Leathermen","a Chevy Volt","some fancy artwork for your home","a fancy engagement ring","a fancy car"));
		irls.put(LIMIT_40, Lists.newArrayList("a baseball autographed by Babe Ruth","a 2003 Honda Silver motorcycle","a condo","a Toyota Hydrogen","a townhouse"));
		irls.put(LIMIT_41, Lists.newArrayList("a new VR","an 2008 Hyundai Accent","a Mercedes-Benz S430","a 2011 BMW 7-Series Sedan","a 2009 BMW Car"));
		irls.put(LIMIT_42, Lists.newArrayList("an old condo","a trailer home","a starter home","a condo in canada","a small home"));
		irls.put(LIMIT_43, Lists.newArrayList("an Audi R8","a starter home","a trailer home","a starter home","a starter home"));
		irls.put(LIMIT_44, Lists.newArrayList("a Ferrari F430","a single family home with 2 bedrooms and 2 bathrooms in Philedelphia","a nice house","an export Ferrari","a nice house","a smaller home in New York"));
		irls.put(LIMIT_45, Lists.newArrayList("a new house","a reasonably sized home in New York","a nice house","a nice house","a reasonably sized home"));
		irls.put(LIMIT_46, Lists.newArrayList("a MultiFamily Complex in Greenvlle, NC","a chromed Audi Spyder automobile","a reasonably sized home","a nice house","a nice house","a nice house"));
		irls.put(LIMIT_47, Lists.newArrayList("a 1914 Babe Ruth baseball card","a luxury home","a house in california","a fancy home","a nice house"));
		irls.put(LIMIT_48, Lists.newArrayList("a new boat","a fancy home","a nice house","a condo in los angeles","a 1985 Chris Craft Boat"));
		irls.put(LIMIT_49, Lists.newArrayList("a mansion","a mansion","a mansion","a mansion","a Diamond"));
		irls.put(LIMIT_50, Lists.newArrayList("a mansion","a really huge mansion","a fancy mansion","a boat","Kim Kardashian's ring"));


		irls.put(LIMIT_END, Lists.newArrayList("Anything you want."));
	}

	public void setIrl(Transaction transaction, int place) {
		transaction.setIrl(irls.get(getKey(transaction.getValue())).get(place));
	}

	private BigDecimal getKey(BigDecimal bigDecimal){
		for(BigDecimal limit : LIMITS){
			if(bigDecimal.compareTo(limit) <= 0){
				return LIMITS.get(LIMITS.indexOf(limit) -1);
			}
		}
		return LIMIT_END;
	}

}
