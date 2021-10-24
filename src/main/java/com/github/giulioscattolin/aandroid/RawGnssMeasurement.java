package com.github.giulioscattolin.aandroid;

public interface RawGnssMeasurement {
    boolean hasTimestampInNanoseconds();

    long getTimestampInNanoseconds();

    boolean hasTimeNanos();

    long getTimeNanos();

    boolean hasLeapSecond();

    int getLeapSecond();

    boolean hasTimeUncertaintyNanos();

    double getTimeUncertaintyNanos();

    boolean hasFullBiasNanos();

    long getFullBiasNanos();

    boolean hasBiasNanos();

    double getBiasNanos();

    boolean hasBiasUncertaintyNanos();

    double getBiasUncertaintyNanos();

    boolean hasDriftNanosPerSecond();

    double getDriftNanosPerSecond();

    boolean hasDriftUncertaintyNanosPerSecond();

    double getDriftUncertaintyNanosPerSecond();

    boolean hasHardwareClockDiscontinuityCount();

    int getHardwareClockDiscontinuityCount();

    boolean hasSvid();

    int getSvid();

    boolean hasTimeOffsetNanos();

    double getTimeOffsetNanos();

    boolean hasReceivedSvTimeNanos();

    long getReceivedSvTimeNanos();

    boolean hasReceivedSvTimeUncertaintyNanos();

    long getReceivedSvTimeUncertaintyNanos();

    boolean hasCn0DbHz();

    double getCn0DbHz();

    boolean hasPseudorangeRateMetersPerSecond();

    double getPseudorangeRateMetersPerSecond();

    boolean hasPseudorangeRateUncertaintyMetersPerSecond();

    double getPseudorangeRateUncertaintyMetersPerSecond();

    boolean hasState();

    int getState();

    boolean hasAccumulatedDeltaRangeState();

    int getAccumulatedDeltaRangeState();

    boolean hasAccumulatedDeltaRangeMeters();

    double getAccumulatedDeltaRangeMeters();

    boolean hasAccumulatedDeltaRangeUncertaintyMeters();

    double getAccumulatedDeltaRangeUncertaintyMeters();

    boolean hasCarrierFrequencyHz();

    double getCarrierFrequencyHz();

    boolean hasCarrierCycles();

    long getCarrierCycles();

    boolean hasCarrierPhase();

    double getCarrierPhase();

    boolean hasCarrierPhaseUncertainty();

    double getCarrierPhaseUncertainty();

    boolean hasMultipathIndicator();

    int getMultipathIndicator();

    boolean hasSnrInDb();

    double getSnrInDb();

    boolean hasConstellationType();

    int getConstellationType();

    boolean hasAgcDb();

    double getAgcDb();

    boolean hasBasebandCn0DbHz();

    double getBasebandCn0DbHz();

    boolean hasFullInterSignalBiasNanos();

    double getFullInterSignalBiasNanos();

    boolean hasFullInterSignalBiasUncertaintyNanos();

    double getFullInterSignalBiasUncertaintyNanos();

    boolean hasSatelliteInterSignalBiasNanos();

    double getSatelliteInterSignalBiasNanos();

    boolean hasSatelliteInterSignalBiasUncertaintyNanos();

    double getSatelliteInterSignalBiasUncertaintyNanos();

    boolean hasCodeType();

    String getCodeType();

    boolean hasChipsetElapsedRealtimeNanos();

    long getChipsetElapsedRealtimeNanos();
}
