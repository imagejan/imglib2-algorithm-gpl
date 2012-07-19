package net.imglib2.algorithm.region.localneighborhood;

import static org.junit.Assert.assertEquals;
import net.imglib2.Cursor;
import net.imglib2.img.Img;
import net.imglib2.img.ImgFactory;
import net.imglib2.img.ImgPlus;
import net.imglib2.img.array.ArrayImgFactory;
import net.imglib2.meta.Axes;
import net.imglib2.meta.AxisType;
import net.imglib2.type.numeric.integer.UnsignedByteType;

import org.junit.Test;

public class SphereNeighborhoodTest {

	private static final int DIM = 100;
	private static final int VAL = 1;


//	/**
//	 * Test if 
//	 * <ul>
//	 * 	<li> <b>at least</b> all the points within the radius are visited by the iterator.
//	 * 	<li> when further than 1 pixel plus the radius, pixels are not visited.
//	 * </ul>
//	 * There is be imprecision on the sphere border due to the pixel discretization.
//	 */
//	@Test
//	public final void testBehavior() {
//
//		long[] center = new long[] { DIM/2, DIM/2, DIM/2}; // the middle
//		double[] calibration = new double[] { 0.5, 0.5, 1 };
//		AxisType[] axes = new AxisType[] { Axes.X, Axes.Y, Axes.Z };
//		double radius = 25;
//
//		final ImgFactory< UnsignedByteType > imgFactory = new ArrayImgFactory<UnsignedByteType>();
//		Img<UnsignedByteType> img = imgFactory.create(new int[] { DIM, DIM, DIM }, new UnsignedByteType());
//		ImgPlus<UnsignedByteType> image = new ImgPlus<UnsignedByteType>(img, "Radius "+radius, axes, calibration);
//
//		// Write into the image
//		SphereNeighborhood<UnsignedByteType> sphere = new SphereNeighborhood<UnsignedByteType>(image, radius);
//		sphere.setPosition(center);
//
//		UnsignedByteType val = new UnsignedByteType(VAL);
//		for(UnsignedByteType pixel : sphere) {
//			pixel.set(val);
//		}
//
//		// Test the image is as expected
//		long[] position = new long[image.numDimensions()]; 
//		Cursor<UnsignedByteType> ic = image.localizingCursor();
//		while(ic.hasNext()) {
//			
//			ic.fwd();
//			ic.localize(position);
//
//			double dist2 = calibration[0] * (position[0] - center[0]) * calibration[0] * (position[0] - center[0] ) 
//					+ calibration[1] * (position[1] - center[1]) * calibration[1] * (position[1] - center[1] )
//					+ calibration[2] * (position[2] - center[2]) * calibration[2] * (position[2] - center[2] );
//			if (dist2 <= radius * radius) {
//
//				assertEquals(VAL, ic.get().get());
//
//			} else if (Math.sqrt(dist2) >  (radius + Math.max( calibration[0], Math.max(calibration[1], calibration[2])))) {
//
//				assertEquals(0, ic.get().get());
//
//			}
//		}
//	}
//
//	@Test
//	public void testSize() {
//
//		AxisType[] axes = new AxisType[] { Axes.X, Axes.Y, Axes.Z };
//		int NTRIALS = 10;
//		final ImgFactory< UnsignedByteType > imgFactory = new ArrayImgFactory<UnsignedByteType>();
//		Img<UnsignedByteType> img = imgFactory.create(new int[] { DIM, DIM, DIM }, new UnsignedByteType());
//
//		for (int i = 0; i < NTRIALS; i++) {
//
//			double[] calibration = new double[] { 0.1 + Math.random(), 0.1 + Math.random(), 0.1 + Math.random() };
//			double radius = 5 + 40 * Math.random();
//			ImgPlus<UnsignedByteType> image = new ImgPlus<UnsignedByteType>(img, "Radius "+radius, axes, calibration);
//			SphereNeighborhood<UnsignedByteType> sphere = new SphereNeighborhood<UnsignedByteType>(image, radius);
//
//			long size = sphere.size();
//
//			long count = 0;
//			for ( @SuppressWarnings("unused") UnsignedByteType type : sphere) {
//				count++;
//			}
//
//			assertEquals(size, count);
//		}
//
//	}
}