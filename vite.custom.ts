import { dirname, resolve } from 'path';
import { fileURLToPath } from 'url';
import type { UserConfig } from 'vite';

const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);

const frontendFolder = resolve(__dirname, './src/main/frontend');

const config: UserConfig = {
  resolve: {
    alias: {
      Frontend: frontendFolder,
      themes: resolve(frontendFolder, './themes'),
    },
  },
  server: {
    host: '0.0.0.0',
    port: 3000,
  },
};

export default config;
