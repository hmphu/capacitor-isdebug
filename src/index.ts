import { registerPlugin } from '@capacitor/core';

import type { IsDebugPlugin } from './definitions';

const IsDebug = registerPlugin<IsDebugPlugin>('IsDebug', {
  web: () => import('./web').then(m => new m.IsDebugWeb()),
});

export * from './definitions';
export { IsDebug };
