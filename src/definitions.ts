export interface IsDebugPlugin {
  /**
   * Return if app is run on debug or release mode.
   * Return null if can't detect.
   */
  getIsDebug(): Promise<{ value: boolean | null }>;
}
