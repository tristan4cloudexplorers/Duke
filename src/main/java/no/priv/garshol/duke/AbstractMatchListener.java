
package no.priv.garshol.duke;

/**
 * Convenience implementation with dummy methods, reflecting the fact
 * that most implementations will only implement matches().
 */
public abstract class AbstractMatchListener implements MatchListener {

  public void startRecord(Record r) {
  }

  public void matchesPerhaps(Record r1, Record r2, double confidence) {
  }
  
  public void endRecord() {
  }
  
}