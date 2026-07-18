package jdk.incubator.vector;

/**
 * Stub exclusivo de compilacion para el subconjunto estable usado por
 * CrashDetector.
 *
 * No debe incluirse en el classpath de ejecucion ni dentro del JAR final.
 */
public abstract class ByteVector {

	public static final VectorSpecies<Byte> SPECIES_PREFERRED = null;

	public static ByteVector fromArray(VectorSpecies<Byte> species, byte[] array, int offset) {
		throw new AssertionError("Stub de compilacion ejecutado por error");
	}

	public abstract VectorMask<Byte> eq(byte value);
}
