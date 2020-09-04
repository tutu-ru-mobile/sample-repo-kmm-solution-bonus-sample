# Uncomment the next line to define a global platform for your project
# platform :ios, '9.0'

workspace 'sample-ios/SampleSolutionBonus.xcworkspace'

if true
# solution bonus sample app
target 'BonusSolutionSampleIos' do
  # Comment the next line if you don't want to use dynamic frameworks
  use_frameworks!
  project 'BonusSolutionSampleIos/BonusSolutionSampleIos.xcodeproj' #todo path sample-ios
  pod 'app_di', :path => 'app-di'
  pod 'app_di_swift', :path => 'app-di/src/iOSMain/swift'
  pod 'lib_basic_swift', :path => 'lib-basic/src/iOSMain/swift'
  pod 'solution_ab_api_swift', :path => 'solution-ab-api/src/iOSMain/swift'
  pod 'solution_bonus_api_swift', :path => 'solution-bonus-api/src/iOSMain/swift'
  pod 'solution_bonus_impl_swift', :path => 'solution/src/iOSMain/swift'

  # Pods for BonusSolutionSampleIos

  target 'BonusSolutionSampleIosTests' do
    inherit! :search_paths
    # Pods for testing
  end

  target 'BonusSolutionSampleIosUITests' do
    # Pods for testing
  end

end
end
