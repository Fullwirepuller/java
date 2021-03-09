package example;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final float frameWidth = 1.0f;
		final float COLOUR_FRAME = 0.1f;
		final float REGULAR_FRAME = 0.15f;
		final float FANCY_FRAME = 0.25f;
		final float CARDBOARD = 0.02f;
		final float GLASS = 0.07f;
		final float CROWN = 0.35f;
		float frameLength;
		float pictureWidth;
		float pictureLength;
		float pictureSquare;
		float frameSquare;
		float colourFrameCost;
		float regularFrameCost;
		float fancyFrameCost;
		float cardboardCost;
		float glassCost;
		float crownCost;
		float costTotal;
		String frameColour;
		String frameType;
		int crownsNumber;

		System.out.println("请输入照片的宽度：");
		pictureWidth = scan.nextFloat();
		System.out.println("请输入照片的长度：");
		pictureLength = scan.nextFloat();
		System.out.println("请输入框架的类型：");
		frameType = scan.next();
		System.out.println("请输入框架的颜色：");
		frameColour = scan.next();
		System.out.println("请输入想要放入皇冠的数量：");
		crownsNumber = scan.nextInt();

		pictureSquare = pictureWidth * pictureLength;
		frameSquare = (pictureWidth + 2 * frameWidth) * (pictureLength + 2 * frameWidth);
		frameLength = 2 * pictureWidth + 2 * pictureLength + 4 * frameWidth;
		colourFrameCost = frameLength * COLOUR_FRAME;
		regularFrameCost = frameLength * REGULAR_FRAME;
		fancyFrameCost = frameLength * FANCY_FRAME;
		cardboardCost = frameSquare * CARDBOARD;
		glassCost = pictureSquare * GLASS;
		crownCost = crownsNumber * CROWN;
		
        if(frameColour.equals("white")) {
        	if(frameType.equals("regular")) {
        		costTotal = regularFrameCost + cardboardCost + glassCost + crownCost;
        		System.out.println("画框的成本为：" + costTotal);
        	}else{
        		costTotal = fancyFrameCost + cardboardCost + glassCost + crownCost;
        		System.out.println("画框的成本为：" + costTotal);
        	}
        }else {
        	if(frameType.equals("regular")) {
        		costTotal = colourFrameCost + regularFrameCost + cardboardCost + glassCost + crownCost;
        		System.out.println("画框的成本为：" + costTotal);
        	}else{
        		costTotal = colourFrameCost + fancyFrameCost + cardboardCost + glassCost + crownCost;
        		System.out.println("画框的成本为：" + costTotal);
        	}
        }
	}
}
