package jdk.incubator.vector;

/**
 * Stub exclusivo de compilacion para el subconjunto estable usado por
 * CrashDetector.
 *
 * No debe incluirse en el classpath de ejecucion ni dentro del JAR final.
 */
public abstract class IntVector {

	public static final VectorSpecies<Integer> SPECIES_PREFERRED = null;

	public static IntVector fromArray(VectorSpecies<Integer> species, int[] array, int offset) {
		throw new AssertionError("Stub de compilacion ejecutado por error");
	}

	public abstract VectorMask<Integer> eq(int value);
}
