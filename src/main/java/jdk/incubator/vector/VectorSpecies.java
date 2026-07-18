package jdk.incubator.vector;

/**
 * Stub exclusivo de compilacion.
 *
 * No debe incluirse en el classpath de ejecucion ni dentro del JAR final.
 */
public interface VectorSpecies<E> {

	int length();

	int loopBound(int length);
}
