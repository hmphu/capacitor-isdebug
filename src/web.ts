import { WebPlugin } from '@capacitor/core';

import type { IsDebugPlugin } from './definitions';

export class IsDebugWeb extends WebPlugin implements IsDebugPlugin {
  async getIsDebug(): Promise<{ value: boolean | null }> {
    return { value: null };
  }
}
