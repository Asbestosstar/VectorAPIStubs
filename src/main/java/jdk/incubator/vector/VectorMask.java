package jdk.incubator.vector;

/**
 * Stub exclusivo de compilacion.
 *
 * No debe incluirse en el classpath de ejecucion ni dentro del JAR final.
 */
public abstract class VectorMask<E> {

	public abstract boolean anyTrue();

	public abstract long toLong();
}
