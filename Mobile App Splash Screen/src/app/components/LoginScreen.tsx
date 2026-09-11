import { motion } from 'motion/react';
import { useState } from 'react';
import { Mail, Lock, Eye, EyeOff } from 'lucide-react';
import logoImage from 'figma:asset/03f99b0456bca66cdd5ebfa9f69a9cdbda49bca4.png';

export function LoginScreen() {
  const [showPassword, setShowPassword] = useState(false);
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleLogin = (e: React.FormEvent) => {
    e.preventDefault();
    // Handle login logic here
    console.log('Login:', { email, password });
  };

  return (
    <div className="flex flex-col size-full bg-gradient-to-br from-purple-600 via-purple-700 to-indigo-800 overflow-hidden">
      {/* Background decorations */}
      <div className="absolute top-20 right-10 w-64 h-64 bg-purple-400/10 rounded-full blur-3xl" />
      <div className="absolute bottom-20 left-10 w-80 h-80 bg-indigo-400/10 rounded-full blur-3xl" />

      {/* Main content */}
      <div className="relative z-10 flex flex-col items-center justify-center flex-1 px-6">
        <motion.div
          className="w-full max-w-md"
          initial={{ opacity: 0, y: 20 }}
          animate={{ opacity: 1, y: 0 }}
          transition={{ duration: 0.6 }}
        >
          {/* Logo and title */}
          <div className="text-center mb-8">
            <motion.div
              className="flex justify-center mb-6"
              initial={{ opacity: 0, scale: 0.8 }}
              animate={{ opacity: 1, scale: 1 }}
              transition={{ duration: 0.6, delay: 0.1 }}
            >
              <img
                src={logoImage}
                alt="SocialOne Logo"
                className="w-full max-w-xs h-auto"
              />
            </motion.div>
            <motion.p
              className="text-purple-200"
              initial={{ opacity: 0 }}
              animate={{ opacity: 1 }}
              transition={{ duration: 0.6, delay: 0.2 }}
            >
              Welcome back! Please login to continue.
            </motion.p>
          </div>

          {/* Login form */}
          <motion.form
            onSubmit={handleLogin}
            className="bg-white/10 backdrop-blur-lg rounded-3xl p-8 shadow-2xl border border-white/20"
            initial={{ opacity: 0, scale: 0.95 }}
            animate={{ opacity: 1, scale: 1 }}
            transition={{ duration: 0.6, delay: 0.3 }}
          >
            {/* Email input */}
            <div className="mb-6">
              <label className="block text-white/90 text-sm mb-2" htmlFor="email">
                Email
              </label>
              <div className="relative">
                <Mail className="absolute left-4 top-1/2 -translate-y-1/2 w-5 h-5 text-purple-300" />
                <input
                  id="email"
                  type="email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  className="w-full bg-white/10 border border-white/30 rounded-xl py-3 pl-12 pr-4 text-white placeholder-purple-200 focus:outline-none focus:border-white/50 focus:bg-white/15 transition-all"
                  placeholder="Enter your email"
                  required
                />
              </div>
            </div>

            {/* Password input */}
            <div className="mb-6">
              <label className="block text-white/90 text-sm mb-2" htmlFor="password">
                Password
              </label>
              <div className="relative">
                <Lock className="absolute left-4 top-1/2 -translate-y-1/2 w-5 h-5 text-purple-300" />
                <input
                  id="password"
                  type={showPassword ? 'text' : 'password'}
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  className="w-full bg-white/10 border border-white/30 rounded-xl py-3 pl-12 pr-12 text-white placeholder-purple-200 focus:outline-none focus:border-white/50 focus:bg-white/15 transition-all"
                  placeholder="Enter your password"
                  required
                />
                <button
                  type="button"
                  onClick={() => setShowPassword(!showPassword)}
                  className="absolute right-4 top-1/2 -translate-y-1/2 text-purple-300 hover:text-white transition-colors"
                >
                  {showPassword ? (
                    <EyeOff className="w-5 h-5" />
                  ) : (
                    <Eye className="w-5 h-5" />
                  )}
                </button>
              </div>
            </div>

            {/* Forgot password */}
            <div className="text-right mb-6">
              <button
                type="button"
                className="text-purple-200 text-sm hover:text-white transition-colors"
              >
                Forgot Password?
              </button>
            </div>

            {/* Login button */}
            <motion.button
              type="submit"
              className="w-full bg-white text-purple-700 rounded-xl py-3 font-semibold hover:bg-purple-50 transition-all shadow-lg"
              whileHover={{ scale: 1.02 }}
              whileTap={{ scale: 0.98 }}
            >
              Login
            </motion.button>

            {/* Sign up link */}
            <div className="text-center mt-6">
              <p className="text-purple-200 text-sm">
                Don't have an account?{' '}
                <button
                  type="button"
                  className="text-white font-semibold hover:underline"
                >
                  Sign Up
                </button>
              </p>
            </div>
          </motion.form>

          {/* Social login options */}
          <motion.div
            className="mt-8"
            initial={{ opacity: 0 }}
            animate={{ opacity: 1 }}
            transition={{ duration: 0.6, delay: 0.5 }}
          >
            <div className="flex items-center gap-4 mb-6">
              <div className="flex-1 h-px bg-white/20" />
              <span className="text-purple-200 text-sm">Or continue with</span>
              <div className="flex-1 h-px bg-white/20" />
            </div>

            <div className="flex gap-4">
              <button className="flex-1 bg-white/10 backdrop-blur-lg border border-white/20 rounded-xl py-3 text-white hover:bg-white/15 transition-all">
                Google
              </button>
              <button className="flex-1 bg-white/10 backdrop-blur-lg border border-white/20 rounded-xl py-3 text-white hover:bg-white/15 transition-all">
                Facebook
              </button>
            </div>
          </motion.div>
        </motion.div>
      </div>
    </div>
  );
}